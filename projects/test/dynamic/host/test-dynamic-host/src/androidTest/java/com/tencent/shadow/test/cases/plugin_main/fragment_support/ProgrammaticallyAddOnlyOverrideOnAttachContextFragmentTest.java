package com.tencent.shadow.test.cases.plugin_main.fragment_support;

public class ProgrammaticallyAddOnlyOverrideOnAttachContextFragmentTest extends ProgrammaticallyAddFragmentTest {
    @Override
    protected String fragmentType() {
        return "OnlyOverrideContextMethodBaseFragment";
    }
}
