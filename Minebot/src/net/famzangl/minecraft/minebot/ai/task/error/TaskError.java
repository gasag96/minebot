/*******************************************************************************
 * This file is part of Minebot.
 *
 * Minebot is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Minebot is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Minebot.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package net.famzangl.minecraft.minebot.ai.task.error;

import net.famzangl.minecraft.minebot.ai.strategy.TaskStrategy;
import net.famzangl.minecraft.minebot.ai.task.TaskOperations;

/**
 * This is an error that occurred while doing a task of a {@link TaskStrategy}.
 * You can add as many errors as you like with the
 * {@link TaskOperations#desync(TaskError)} method. Multiple errors of the same
 * type are automatically filtered.
 * 
 * @author michael
 *
 */
public class TaskError {
	private final String message;

	protected TaskError(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public boolean shouldBeDisplayed() {
		return true;
	}

}
