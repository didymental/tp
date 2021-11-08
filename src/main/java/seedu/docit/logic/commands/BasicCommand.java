package seedu.docit.logic.commands;

import seedu.docit.logic.commands.exceptions.CommandException;
import seedu.docit.model.Model;

/**
 * Represents a basic command agnostic of patient or appointment
 * with hidden internal logic and the ability to be executed.
 */
public abstract class BasicCommand extends Command {

    /**
     * Executes the command and returns the result message.
     *
     * @param model {@code Model} which the command should operate on.
     * @return feedback message of the operation result for display
     * @throws CommandException If an error occurs during command execution.
     */
    @Override
    public abstract CommandResult execute(Model model) throws CommandException;

}
