/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.zdal.parser.sql.dialect.oracle.ast.stmt;

import com.alipay.zdal.parser.sql.ast.SQLName;
import com.alipay.zdal.parser.sql.dialect.oracle.visitor.OracleASTVisitor;

/**
 * 
 * @author ����
 * @version $Id: OracleAlterTableMoveTablespace.java, v 0.1 2012-11-17 ����3:45:27 Exp $
 */
public class OracleAlterTableMoveTablespace extends OracleAlterTableItem {

    private static final long serialVersionUID = 1L;

    private SQLName           name;

    @Override
    public void accept0(OracleASTVisitor visitor) {
        if (visitor.visit(this)) {
            acceptChild(visitor, name);
        }
        visitor.endVisit(this);
    }

    public SQLName getName() {
        return name;
    }

    public void setName(SQLName name) {
        this.name = name;
    }

}
