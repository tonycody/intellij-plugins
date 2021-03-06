package com.jetbrains.lang.dart.ide.fileStructure;

import com.intellij.testFramework.FileStructureTestBase;
import com.intellij.testFramework.PlatformTestUtil;

import static com.jetbrains.lang.dart.util.DartTestUtils.BASE_TEST_DATA_PATH;

public class DartFileStructureTest extends FileStructureTestBase {

  @Override
  protected void checkTree() {
    assertSameLinesWithFile(BASE_TEST_DATA_PATH + getBasePath() + "/" + getTreeFileName(), PlatformTestUtil.print(getTree(), true).trim());
  }

  @Override
  protected String getFileExtension() {
    myFixture.setTestDataPath(BASE_TEST_DATA_PATH + getBasePath());
    return "dart";
  }

  @Override
  protected String getBasePath() {
    return "/fileStructure/";
  }

  public void testConstructor() {
    checkTree();
  }

  public void testEnums() {
    checkTree();
  }

  public void testInsideClass() {
    checkTree();
  }

  public void testTopLevel() {
    checkTree();
  }
}
