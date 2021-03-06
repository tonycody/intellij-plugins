/*
 * Copyright 2009 The authors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.struts2.model.constant.contributor;

import com.intellij.openapi.module.Module;
import com.intellij.struts2.model.constant.StrutsConstant;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yann C&eacute;bron
 */
public class StrutsRESTPluginConstantContributor extends StrutsConstantContributorBase {

  @NonNls
  private static final List<StrutsConstant> CONSTANTS = Arrays.asList(
      addStringProperty("struts.rest.handlerOverride.[EXTENSION]"),
      addStringProperty("struts.rest.defaultExtension"),
      addIntegerProperty("struts.rest.validationFailureStatusCode"),

      addStringProperty("struts.mapper.idParameterNam"),
      addStringProperty("struts.mapper.indexMethodName"),
      addStringProperty("struts.mapper.getMethodName"),
      addStringProperty("struts.mapper.postMethodName"),
      addStringProperty("struts.mapper.putMethodName"),
      addStringProperty("struts.mapper.deleteMethodName"),
      addStringProperty("struts.mapper.editMethodName"),
      addStringProperty("struts.mapper.newMethodName")
  );

  @NotNull
  @Override
  protected String getRequiredPluginClassName() {
    return "org.apache.struts2.rest.handler.ContentTypeHandler";
  }

  @NotNull
  public List<StrutsConstant> getStrutsConstantDefinitions(@NotNull final Module module) {
    return CONSTANTS;
  }

}