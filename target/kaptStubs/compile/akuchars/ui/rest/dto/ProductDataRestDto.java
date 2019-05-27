package akuchars.ui.rest.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lakuchars/ui/rest/dto/ProductDataRestDto;", "", "id", "", "name", "", "colorDto", "Lakuchars/ui/rest/dto/ProductColorRestDto;", "amount", "Ljava/math/BigDecimal;", "(JLjava/lang/String;Lakuchars/ui/rest/dto/ProductColorRestDto;Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "getColorDto", "()Lakuchars/ui/rest/dto/ProductColorRestDto;", "getId", "()J", "getName", "()Ljava/lang/String;", "devinity"})
public final class ProductDataRestDto {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final akuchars.ui.rest.dto.ProductColorRestDto colorDto = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal amount = null;
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final akuchars.ui.rest.dto.ProductColorRestDto getColorDto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getAmount() {
        return null;
    }
    
    public ProductDataRestDto(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    akuchars.ui.rest.dto.ProductColorRestDto colorDto, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
        super();
    }
}