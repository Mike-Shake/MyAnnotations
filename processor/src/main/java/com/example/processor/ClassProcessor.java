package com.example.processor;



import com.example.annstations.BindView;
import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;


//@SupportedSourceVersion(SourceVersion.RELEASE_8)
//@SupportedAnnotationTypes("com.example.annstations.BindView")
@AutoService(Processor.class)
public class ClassProcessor extends AbstractProcessor {
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        Messager messager=processingEnv.getMessager();
        for(Element element:roundEnvironment.getElementsAnnotatedWith(BindView.class)){
            if (element.getKind() == ElementKind.FIELD) {;
                messager.printMessage(Diagnostic.Kind.NOTE, "printMessage:" + element.toString());
            }
        }
        return true;
    }
}
