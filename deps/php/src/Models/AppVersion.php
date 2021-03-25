<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppVersion extends Model {
    protected $_name = [
        'appId' => 'app_id',
        'branch' => 'branch',
        'buildType' => 'build_type',
        'codeVersion' => 'code_version',
        'description' => 'description',
        'errorCode' => 'error_code',
        'errorMsg' => 'error_msg',
        'etag' => 'etag',
        'id' => 'id',
        'status' => 'status',
        'taskId' => 'task_id',
        'utcCreate' => 'utc_create',
        'version' => 'version',
        'workspaceId' => 'workspace_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->branch) {
            $res['branch'] = $this->branch;
        }
        if (null !== $this->buildType) {
            $res['build_type'] = $this->buildType;
        }
        if (null !== $this->codeVersion) {
            $res['code_version'] = $this->codeVersion;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->etag) {
            $res['etag'] = $this->etag;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppVersion
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['branch'])){
            $model->branch = $map['branch'];
        }
        if(isset($map['build_type'])){
            $model->buildType = $map['build_type'];
        }
        if(isset($map['code_version'])){
            $model->codeVersion = $map['code_version'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['error_msg'])){
            $model->errorMsg = $map['error_msg'];
        }
        if(isset($map['etag'])){
            $model->etag = $map['etag'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['utc_create'])){
            $model->utcCreate = $map['utc_create'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        return $model;
    }
    // 所属应用id `内部id对用户无用，不应返回，应使用应用名称`
    /**
     * @example 
     * @var string
     */
    public $appId;

    // 从源代码构建时标识代码分支，上传新版本时为空 `混淆了应用版本和编译任务；目前没必要返回`
    /**
     * @example 
     * @var string
     */
    public $branch;

    // 应用发布包构建类型:**scm**(源代码构建)，**upload_file**(发布包上传包括本地上传和从某个文件交换源上传) `混淆了应用版本和编译任务；目前没必要返回`
    // 
    /**
     * @example 
     * @var string
     */
    public $buildType;

    // 从源代码构建时标识代码版本，上传新版本时为空 `混淆了应用版本和编译任务；目前没必要返回`
    /**
     * @example 
     * @var string
     */
    public $codeVersion;

    // 版本描述
    /**
     * @example 
     * @var string
     */
    public $description;

    // 新版本构建的错误码，成功则为空 `混淆了应用版本和编译任务`
    /**
     * @example 
     * @var string
     */
    public $errorCode;

    // 新版本构建的错误提示信息，成功则为空 `混淆了应用版本和编译任务`
    /**
     * @example 
     * @var string
     */
    public $errorMsg;

    // 构建成功后标识应用发布包的md5
    /**
     * @example 
     * @var string
     */
    public $etag;

    // 应用版本id `内部id对用户无用，不应返回`
    /**
     * @example 
     * @var string
     */
    public $id;

    // 应用构建状态:**doing**(进行中),**success**(成功),**failed**(失败)
    /**
     * @example 
     * @var string
     */
    public $status;

    // 本次应用发布包构建后台任务的id `混淆了应用版本和构建任务，应使用2个不同的模型`
    /**
     * @example 
     * @var string
     */
    public $taskId;

    // 创建时间 `命名建议为create_time`
    /**
     * @example 
     * @var string
     */
    public $utcCreate;

    // 应用版本号
    /**
     * @example 
     * @var string
     */
    public $version;

    // 所属工作空间 `内部id对用户无用，不应返回，应使用workspace unique名称`
    /**
     * @example 
     * @var string
     */
    public $workspaceId;

}
