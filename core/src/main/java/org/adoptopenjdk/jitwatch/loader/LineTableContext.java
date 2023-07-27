package org.adoptopenjdk.jitwatch.loader;

import org.adoptopenjdk.jitwatch.model.MemberSignatureParts;
import org.adoptopenjdk.jitwatch.model.bytecode.ClassBC;
import org.adoptopenjdk.jitwatch.model.bytecode.MemberBytecode;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LineTableContext {
    private String fqClassName;
    private ClassBC classBytecode;
    private StringBuilder builder;
    private BytecodeLoader.BytecodeSection section;
    private MemberSignatureParts msp;
    private MemberBytecode memberBytecode;
    private String line;

    // Constructor
    public LineTableContext() {
    }

    // Getters and Setters
    public String getFqClassName() {
        return fqClassName;
    }

    public void setFqClassName(String fqClassName) {
        this.fqClassName = fqClassName;
    }

    public ClassBC getClassBytecode() {
        return classBytecode;
    }

    public void setClassBytecode(ClassBC classBytecode) {
        this.classBytecode = classBytecode;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(StringBuilder builder) {
        this.builder = builder;
    }

    public BytecodeLoader.BytecodeSection getSection() {
        return section;
    }

    public void setSection(BytecodeLoader.BytecodeSection section) {
        this.section = section;
    }

    public MemberSignatureParts getMsp() {
        return msp;
    }

    public void setMsp(MemberSignatureParts msp) {
        this.msp = msp;
    }

    public MemberBytecode getMemberBytecode() {
        return memberBytecode;
    }

    public void setMemberBytecode(MemberBytecode memberBytecode) {
        this.memberBytecode = memberBytecode;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
