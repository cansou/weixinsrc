.class public final LQQPIM/FBIllegaSoft;
.super Lcom/a/a/a/g;


# static fields
.field static final synthetic $assertionsDisabled:Z

.field static cache_illreason:I

.field static cache_softkey:LQQPIM/SoftKey;


# instance fields
.field public company:Ljava/lang/String;

.field public illreason:I

.field public softkey:LQQPIM/SoftKey;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LQQPIM/FBIllegaSoft;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, LQQPIM/FBIllegaSoft;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/a/a/a/g;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    const-string v0, ""

    iput-object v0, p0, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, LQQPIM/FBIllegaSoft;->illreason:I

    return-void
.end method

.method public constructor <init>(LQQPIM/SoftKey;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Lcom/a/a/a/g;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    const-string v0, ""

    iput-object v0, p0, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, LQQPIM/FBIllegaSoft;->illreason:I

    iput-object p1, p0, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    iput-object p2, p0, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    iput p3, p0, LQQPIM/FBIllegaSoft;->illreason:I

    return-void
.end method


# virtual methods
.method public final className()Ljava/lang/String;
    .locals 1

    const-string v0, "QQPIM.FBIllegaSoft"

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    return-object v0

    :catch_0
    move-exception v1

    sget-boolean v1, LQQPIM/FBIllegaSoft;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final display(Ljava/lang/StringBuilder;I)V
    .locals 3

    new-instance v0, Lcom/a/a/a/h;

    invoke-direct {v0, p1, p2}, Lcom/a/a/a/h;-><init>(Ljava/lang/StringBuilder;I)V

    iget-object v1, p0, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    const-string v2, "softkey"

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a/h;->a(Lcom/a/a/a/g;Ljava/lang/String;)Lcom/a/a/a/h;

    iget-object v1, p0, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    const-string v2, "company"

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/a/a/a/h;

    iget v1, p0, LQQPIM/FBIllegaSoft;->illreason:I

    const-string v2, "illreason"

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a/h;->a(ILjava/lang/String;)Lcom/a/a/a/h;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    check-cast p1, LQQPIM/FBIllegaSoft;

    iget-object v0, p0, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    iget-object v1, p1, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    invoke-static {v0, v1}, Lcom/a/a/a/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    iget-object v1, p1, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/a/a/a/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LQQPIM/FBIllegaSoft;->illreason:I

    iget v1, p1, LQQPIM/FBIllegaSoft;->illreason:I

    invoke-static {v0, v1}, Lcom/a/a/a/c;->a(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getCompany()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    return-object v0
.end method

.method public final getIllreason()I
    .locals 1

    iget v0, p0, LQQPIM/FBIllegaSoft;->illreason:I

    return v0
.end method

.method public final getSoftkey()LQQPIM/SoftKey;
    .locals 1

    iget-object v0, p0, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    return-object v0
.end method

.method public final readFrom(Lcom/a/a/a/a;)V
    .locals 3

    const/4 v2, 0x1

    sget-object v0, LQQPIM/FBIllegaSoft;->cache_softkey:LQQPIM/SoftKey;

    if-nez v0, :cond_0

    new-instance v0, LQQPIM/SoftKey;

    invoke-direct {v0}, LQQPIM/SoftKey;-><init>()V

    sput-object v0, LQQPIM/FBIllegaSoft;->cache_softkey:LQQPIM/SoftKey;

    :cond_0
    sget-object v0, LQQPIM/FBIllegaSoft;->cache_softkey:LQQPIM/SoftKey;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/a/a/a/a;->a(Lcom/a/a/a/g;IZ)Lcom/a/a/a/g;

    move-result-object v0

    check-cast v0, LQQPIM/SoftKey;

    iput-object v0, p0, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    invoke-virtual {p1, v2, v2}, Lcom/a/a/a/a;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    iget v0, p0, LQQPIM/FBIllegaSoft;->illreason:I

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1, v2}, Lcom/a/a/a/a;->a(IIZ)I

    move-result v0

    iput v0, p0, LQQPIM/FBIllegaSoft;->illreason:I

    return-void
.end method

.method public final setCompany(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    return-void
.end method

.method public final setIllreason(I)V
    .locals 0

    iput p1, p0, LQQPIM/FBIllegaSoft;->illreason:I

    return-void
.end method

.method public final setSoftkey(LQQPIM/SoftKey;)V
    .locals 0

    iput-object p1, p0, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    return-void
.end method

.method public final writeTo(Lcom/a/a/a/e;)V
    .locals 2

    iget-object v0, p0, LQQPIM/FBIllegaSoft;->softkey:LQQPIM/SoftKey;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/a/a/a/e;->a(Lcom/a/a/a/g;I)V

    iget-object v0, p0, LQQPIM/FBIllegaSoft;->company:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/a/e;->a(Ljava/lang/String;I)V

    iget v0, p0, LQQPIM/FBIllegaSoft;->illreason:I

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/a/a/a/e;->a(II)V

    return-void
.end method
