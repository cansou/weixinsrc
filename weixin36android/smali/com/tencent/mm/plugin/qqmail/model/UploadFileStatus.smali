.class public Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;
.super Lcom/tencent/mm/protobuf/BaseProtoBuf;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:J

.field private g:Z

.field private h:I

.field private i:Z

.field private j:J

.field private k:Z

.field private l:Ljava/lang/String;

.field private m:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/tencent/mm/protobuf/BaseProtoBuf;-><init>()V

    return-void
.end method

.method protected static a(Lc/a/a/b/a;Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;I)Z
    .locals 3

    const/4 v0, 0x1

    packed-switch p2, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    invoke-virtual {p0}, Lc/a/a/b/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->a(Ljava/lang/String;)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lc/a/a/b/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->b(Ljava/lang/String;)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lc/a/a/b/a;->d()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->a(J)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lc/a/a/b/a;->a()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->a(I)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, Lc/a/a/b/a;->d()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->b(J)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;

    goto :goto_0

    :pswitch_5
    invoke-virtual {p0}, Lc/a/a/b/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->c(Ljava/lang/String;)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 4

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lc/a/a/a;->a(ILjava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lc/a/a/a;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->f:J

    invoke-static {v1, v2, v3}, Lc/a/a/a;->a(IJ)I

    move-result v1

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->i:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    iget v2, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->h:I

    invoke-static {v1, v2}, Lc/a/a/a;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-boolean v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->k:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x5

    iget-wide v2, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->j:J

    invoke-static {v1, v2, v3}, Lc/a/a/a;->a(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-boolean v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->m:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->l:Ljava/lang/String;

    invoke-static {v1, v2}, Lc/a/a/a;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    add-int/lit8 v0, v0, 0x0

    return v0
.end method

.method public final a(I)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;
    .locals 1

    iput p1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->i:Z

    return-object p0
.end method

.method public final a(J)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;
    .locals 1

    iput-wide p1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->f:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->g:Z

    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;
    .locals 1

    iput-object p1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->b:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->c:Z

    return-object p0
.end method

.method public final a(Lc/a/a/c/a;)V
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lc/a/a/c/a;->a(ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lc/a/a/c/a;->a(ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->f:J

    invoke-virtual {p1, v0, v1, v2}, Lc/a/a/c/a;->a(IJ)V

    iget-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    iget v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->h:I

    invoke-virtual {p1, v0, v1}, Lc/a/a/c/a;->a(II)V

    :cond_0
    iget-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->k:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x5

    iget-wide v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->j:J

    invoke-virtual {p1, v0, v1, v2}, Lc/a/a/c/a;->a(IJ)V

    :cond_1
    iget-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->m:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->l:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lc/a/a/c/a;->a(ILjava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final b(J)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;
    .locals 1

    iput-wide p1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->j:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->k:Z

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;
    .locals 1

    iput-object p1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->d:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->e:Z

    return-object p0
.end method

.method public final b()[B
    .locals 3

    iget-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->c:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->g:Z

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lc/a/a/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not all required fields were included (false = not included in message),  path:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->c:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " name:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->e:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->g:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/c;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-super {p0}, Lcom/tencent/mm/protobuf/BaseProtoBuf;->b()[B

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;
    .locals 1

    iput-object p1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->l:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->m:Z

    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->f:J

    return-wide v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->h:I

    return v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->j:J

    return-wide v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->l:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, ""

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "path = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "name = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->i:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "state = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->k:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "requestId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->j:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    iget-boolean v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->m:Z

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "svrId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/mm/plugin/qqmail/model/UploadFileStatus;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
