.class public final LQQPIM/Category;
.super Lcom/a/a/a/g;


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field public count:I

.field public icon:Ljava/lang/String;

.field public id:I

.field public name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LQQPIM/Category;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, LQQPIM/Category;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/a/a/a/g;-><init>()V

    iput v1, p0, LQQPIM/Category;->id:I

    const-string v0, ""

    iput-object v0, p0, LQQPIM/Category;->name:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, LQQPIM/Category;->icon:Ljava/lang/String;

    iput v1, p0, LQQPIM/Category;->count:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/a/a/a/g;-><init>()V

    iput v1, p0, LQQPIM/Category;->id:I

    const-string v0, ""

    iput-object v0, p0, LQQPIM/Category;->name:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, LQQPIM/Category;->icon:Ljava/lang/String;

    iput v1, p0, LQQPIM/Category;->count:I

    iput p1, p0, LQQPIM/Category;->id:I

    iput-object p2, p0, LQQPIM/Category;->name:Ljava/lang/String;

    iput-object p3, p0, LQQPIM/Category;->icon:Ljava/lang/String;

    iput p4, p0, LQQPIM/Category;->count:I

    return-void
.end method


# virtual methods
.method public final className()Ljava/lang/String;
    .locals 1

    const-string v0, "QQPIM.Category"

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

    sget-boolean v1, LQQPIM/Category;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final display(Ljava/lang/StringBuilder;I)V
    .locals 3

    new-instance v0, Lcom/a/a/a/h;

    invoke-direct {v0, p1, p2}, Lcom/a/a/a/h;-><init>(Ljava/lang/StringBuilder;I)V

    iget v1, p0, LQQPIM/Category;->id:I

    const-string v2, "id"

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a/h;->a(ILjava/lang/String;)Lcom/a/a/a/h;

    iget-object v1, p0, LQQPIM/Category;->name:Ljava/lang/String;

    const-string v2, "name"

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/a/a/a/h;

    iget-object v1, p0, LQQPIM/Category;->icon:Ljava/lang/String;

    const-string v2, "icon"

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/a/a/a/h;

    iget v1, p0, LQQPIM/Category;->count:I

    const-string v2, "count"

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a/h;->a(ILjava/lang/String;)Lcom/a/a/a/h;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    check-cast p1, LQQPIM/Category;

    iget v0, p0, LQQPIM/Category;->id:I

    iget v1, p1, LQQPIM/Category;->id:I

    invoke-static {v0, v1}, Lcom/a/a/a/c;->a(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQQPIM/Category;->name:Ljava/lang/String;

    iget-object v1, p1, LQQPIM/Category;->name:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/a/a/a/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQQPIM/Category;->icon:Ljava/lang/String;

    iget-object v1, p1, LQQPIM/Category;->icon:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/a/a/a/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LQQPIM/Category;->count:I

    iget v1, p1, LQQPIM/Category;->count:I

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

.method public final getCount()I
    .locals 1

    iget v0, p0, LQQPIM/Category;->count:I

    return v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LQQPIM/Category;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, LQQPIM/Category;->id:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LQQPIM/Category;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final readFrom(Lcom/a/a/a/a;)V
    .locals 3

    const/4 v2, 0x1

    iget v0, p0, LQQPIM/Category;->id:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/a/a/a/a;->a(IIZ)I

    move-result v0

    iput v0, p0, LQQPIM/Category;->id:I

    invoke-virtual {p1, v2, v2}, Lcom/a/a/a/a;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LQQPIM/Category;->name:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-virtual {p1, v0, v2}, Lcom/a/a/a/a;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LQQPIM/Category;->icon:Ljava/lang/String;

    iget v0, p0, LQQPIM/Category;->count:I

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1, v2}, Lcom/a/a/a/a;->a(IIZ)I

    move-result v0

    iput v0, p0, LQQPIM/Category;->count:I

    return-void
.end method

.method public final setCount(I)V
    .locals 0

    iput p1, p0, LQQPIM/Category;->count:I

    return-void
.end method

.method public final setIcon(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LQQPIM/Category;->icon:Ljava/lang/String;

    return-void
.end method

.method public final setId(I)V
    .locals 0

    iput p1, p0, LQQPIM/Category;->id:I

    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LQQPIM/Category;->name:Ljava/lang/String;

    return-void
.end method

.method public final writeTo(Lcom/a/a/a/e;)V
    .locals 2

    iget v0, p0, LQQPIM/Category;->id:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/a/a/a/e;->a(II)V

    iget-object v0, p0, LQQPIM/Category;->name:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/a/e;->a(Ljava/lang/String;I)V

    iget-object v0, p0, LQQPIM/Category;->icon:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/a/a/a/e;->a(Ljava/lang/String;I)V

    iget v0, p0, LQQPIM/Category;->count:I

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Lcom/a/a/a/e;->a(II)V

    return-void
.end method