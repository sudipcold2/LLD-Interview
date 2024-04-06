package com.sudipcold.designpatterns.behavorial.visitor;

public interface IAircraftVisitor {
    void visitF16(F16 f16);
    void visitBoeing747(Boeing747 boeing747);
}
