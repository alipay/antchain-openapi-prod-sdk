<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppExtraInfo;

class GetApplicationResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'alias' => 'alias',
        'applicationName' => 'application_name',
        'appExtraInfos' => 'app_extra_infos',
        'appGroupName' => 'app_group_name',
        'appLevel' => 'app_level',
        'buildpackName' => 'buildpack_name',
        'creationTime' => 'creation_time',
        'description' => 'description',
        'ownerLoginName' => 'owner_login_name',
        'status' => 'status',
        'deployType' => 'deploy_type',
        'globalName' => 'global_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->appExtraInfos) {
            $res['app_extra_infos'] = [];
            if(null !== $this->appExtraInfos && is_array($this->appExtraInfos)){
                $n = 0;
                foreach($this->appExtraInfos as $item){
                    $res['app_extra_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->appGroupName) {
            $res['app_group_name'] = $this->appGroupName;
        }
        if (null !== $this->appLevel) {
            $res['app_level'] = $this->appLevel;
        }
        if (null !== $this->buildpackName) {
            $res['buildpack_name'] = $this->buildpackName;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->deployType) {
            $res['deploy_type'] = $this->deployType;
        }
        if (null !== $this->globalName) {
            $res['global_name'] = $this->globalName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetApplicationResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['alias'])){
            $model->alias = $map['alias'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['app_extra_infos'])){
            if(!empty($map['app_extra_infos'])){
                $model->appExtraInfos = [];
                $n = 0;
                foreach($map['app_extra_infos'] as $item) {
                    $model->appExtraInfos[$n++] = null !== $item ? AppExtraInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['app_group_name'])){
            $model->appGroupName = $map['app_group_name'];
        }
        if(isset($map['app_level'])){
            $model->appLevel = $map['app_level'];
        }
        if(isset($map['buildpack_name'])){
            $model->buildpackName = $map['buildpack_name'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['deploy_type'])){
            $model->deployType = $map['deploy_type'];
        }
        if(isset($map['global_name'])){
            $model->globalName = $map['global_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 应用别名
    /**
     * @var string
     */
    public $alias;

    // 应用名称
    /**
     * @var string
     */
    public $applicationName;

    // 应用额外元数据信息
    /**
     * @var AppExtraInfo[]
     */
    public $appExtraInfos;

    // 应用所属分组名
    /**
     * @var string
     */
    public $appGroupName;

    // 应用等级名称
    /**
     * @var string
     */
    public $appLevel;

    // 技术栈名称
    /**
     * @var string
     */
    public $buildpackName;

    // 应用创建时间
    /**
     * @var string
     */
    public $creationTime;

    // 应用描述
    /**
     * @var string
     */
    public $description;

    // 应用负责人登录名
    /**
     * @var string
     */
    public $ownerLoginName;

    // 应用状态。取值列表：
    // CREATING：应用创建中；
    // CREATED：应用成功创建，可正常使用；
    // CREATE_FAILED：应用创建失败
    // 
    /**
     * @var string
     */
    public $status;

    // 发布模式， package，image，mixed
    /**
     * @var string
     */
    public $deployType;

    // 全局唯一名字
    /**
     * @var string
     */
    public $globalName;

}
