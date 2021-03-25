<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\TemplateParamDef;

class AppConfigTemplate extends Model {
    protected $_name = [
        'appName' => 'app_name',
        'comment' => 'comment',
        'id' => 'id',
        'operatorId' => 'operator_id',
        'params' => 'params',
        'releaseTime' => 'release_time',
        'state' => 'state',
        'tenantId' => 'tenant_id',
        'tplVersion' => 'tpl_version',
        'createdTime' => 'created_time',
        'modifiedTime' => 'modified_time',
    ];
    public function validate() {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validatePattern('releaseTime', $this->releaseTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->params) {
            $res['params'] = [];
            if(null !== $this->params && is_array($this->params)){
                $n = 0;
                foreach($this->params as $item){
                    $res['params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->releaseTime) {
            $res['release_time'] = $this->releaseTime;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tplVersion) {
            $res['tpl_version'] = $this->tplVersion;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppConfigTemplate
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['comment'])){
            $model->comment = $map['comment'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['operator_id'])){
            $model->operatorId = $map['operator_id'];
        }
        if(isset($map['params'])){
            if(!empty($map['params'])){
                $model->params = [];
                $n = 0;
                foreach($map['params'] as $item) {
                    $model->params[$n++] = null !== $item ? TemplateParamDef::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['release_time'])){
            $model->releaseTime = $map['release_time'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['tpl_version'])){
            $model->tplVersion = $map['tpl_version'];
        }
        if(isset($map['created_time'])){
            $model->createdTime = $map['created_time'];
        }
        if(isset($map['modified_time'])){
            $model->modifiedTime = $map['modified_time'];
        }
        return $model;
    }
    // 应用名称
    /**
     * @example apaks
     * @var string
     */
    public $appName;

    // 描述
    /**
     * @example 应用容器服务
     * @var string
     */
    public $comment;

    // 应用参数模板 id
    /**
     * @example 00000000300402
     * @var string
     */
    public $id;

    // 操作人 id
    /**
     * @example 00000000400301
     * @var string
     */
    public $operatorId;

    // 参数定义列表
    /**
     * @example []
     * @var TemplateParamDef[]
     */
    public $params;

    // 参数模板发布时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $releaseTime;

    // 模板状态，DRAFT 草稿，RELEASE 已发布，发布后才会生成 version，否则为空
    /**
     * @example DRAFT,RELEASE
     * @var string
     */
    public $state;

    // 租户 id
    /**
     * @example 00000000400402
     * @var string
     */
    public $tenantId;

    // 模板版本
    /**
     * @example 1584434797339.c3ea
     * @var string
     */
    public $tplVersion;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $createdTime;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modifiedTime;

}
