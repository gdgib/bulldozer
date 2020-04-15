package com.g2forge.bulldozer.build;

import com.g2forge.alexandria.command.command.IStandardCommand;
import com.g2forge.alexandria.command.command.IStructuredCommand;

public class BulldozerBuild implements IStructuredCommand {
	public static void main(String[] args) throws Throwable {
		final IStructuredCommand.SubCommandBuilder builder = new IStructuredCommand.SubCommandBuilder();
		builder.add(Catalog.COMMAND_FACTORY, "catalog");
		builder.add(CreateProject.COMMAND_FACTORY, "create-project");
		builder.add(CreatePRs.COMMAND_FACTORY, "create-prs");
		builder.add(CleanupPRs.COMMAND_FACTORY, "cleanup-prs");
		builder.add(Release.COMMAND_FACTORY, "release");
		final IStandardCommand command = builder.build();
		IStandardCommand.main(args, command);
	}
}
