/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.gui.service.treenode

import javax.swing.*

class WebinfClassesDirectoryTreeNodeFactoryProvider extends DirectoryTreeNodeFactoryProvider {
    static final ImageIcon ICON = new ImageIcon(WebinfClassesDirectoryTreeNodeFactoryProvider.class.classLoader.getResource('images/packagefolder_obj.png'))

    String[] getSelectors() { ['war:dir:WEB-INF/classes'] }

    ImageIcon getIcon() { ICON }
    ImageIcon getOpenIcon() { null }
}
