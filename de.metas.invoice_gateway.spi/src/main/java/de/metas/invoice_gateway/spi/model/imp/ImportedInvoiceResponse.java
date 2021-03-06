package de.metas.invoice_gateway.spi.model.imp;

import java.time.Instant;
import java.util.Map;

import javax.annotation.Nullable;

import de.metas.invoice_gateway.spi.model.InvoiceId;
import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.Value;

/*
 * #%L
 * metasfresh-invoice_gateway.spi
 * %%
 * Copyright (C) 2019 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

/**
 * Contains the response from a 3rd party that reacted to an invoice with we send from metasfresh.
 */
@Value
@Builder(toBuilder=true)
public class ImportedInvoiceResponse
{
	public enum Status
	{
		ACCEPTET, PENDING, REJECTED
	}

	@Nullable
	InvoiceId invoiceId;

	@NonNull
	String documentNumber;

	@NonNull
	Instant invoiceCreated;

	Status status;

	ImportInvoiceResponseRequest request;

	@Singular
	Map<String, String> additionalTags;
}
