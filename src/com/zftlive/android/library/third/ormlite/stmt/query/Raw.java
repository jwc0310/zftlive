package com.zftlive.android.library.third.ormlite.stmt.query;

import java.util.List;

import com.zftlive.android.library.third.ormlite.db.DatabaseType;
import com.zftlive.android.library.third.ormlite.stmt.ArgumentHolder;

/**
 * Raw part of the where to just stick in a string in the middle of the WHERE. It is up to the user to do so properly.
 * 
 * @author graywatson
 */
public class Raw implements Clause {

	private final String statement;
	private final ArgumentHolder[] args;

	public Raw(String statement, ArgumentHolder[] args) {
		this.statement = statement;
		this.args = args;
	}

	public void appendSql(DatabaseType databaseType, String tableName, StringBuilder sb, List<ArgumentHolder> argList) {
		sb.append(statement);
		sb.append(' ');
		for (ArgumentHolder arg : args) {
			argList.add(arg);
		}
	}
}
