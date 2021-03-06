package com.jetbrains.lang.dart.ide.actions;

import com.intellij.openapi.project.Project;
import com.jetbrains.lang.dart.DartBundle;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

public class DartPubGetAction extends DartPubActionBase {
  @Nls
  @Override
  protected String getTitle() {
    return DartBundle.message("dart.pub.get.title");
  }

  @Nullable
  protected String[] calculatePubParameters(final Project project) {
    return new String[]{"get"};
  }
}
