<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetSingleworkspaceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'createdTime' => 'created_time',
        'displayName' => 'display_name',
        'id' => 'id',
        'modifiedTime' => 'modified_time',
        'name' => 'name',
        'networkType' => 'network_type',
        'region' => 'region',
        'tenant' => 'tenant',
        'type' => 'type',
        'vpcIaasId' => 'vpc_iaas_id',
        'workspaceGroup' => 'workspace_group',
        'zones' => 'zones',
    ];
    public function validate() {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
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
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->vpcIaasId) {
            $res['vpc_iaas_id'] = $this->vpcIaasId;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetSingleworkspaceResponse
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
        if(isset($map['created_time'])){
            $model->createdTime = $map['created_time'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['modified_time'])){
            $model->modifiedTime = $map['modified_time'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['network_type'])){
            $model->networkType = $map['network_type'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['vpc_iaas_id'])){
            $model->vpcIaasId = $map['vpc_iaas_id'];
        }
        if(isset($map['workspace_group'])){
            $model->workspaceGroup = $map['workspace_group'];
        }
        if(isset($map['zones'])){
            if(!empty($map['zones'])){
                $model->zones = $map['zones'];
            }
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

    // 创建时间。
    /**
     * @var string
     */
    public $createdTime;

    // workspace工作空间的显示名称
    /**
     * @var string
     */
    public $displayName;

    // workspace名称。
    /**
     * @var string
     */
    public $id;

    // 最近修改时间。
    /**
     * @var string
     */
    public $modifiedTime;

    // workspace显示名称。
    /**
     * @var string
     */
    public $name;

    // 网络类型。
    /**
     * @var string
     */
    public $networkType;

    // region id
    /**
     * @var string
     */
    public $region;

    // 所属租户信息。
    /**
     * @var string
     */
    public $tenant;

    // 工作空间类型：标准工作空间；单元化工作空间
    /**
     * @var string
     */
    public $type;

    // vpc iaas id
    /**
     * @var string
     */
    public $vpcIaasId;

    // workspace所属环境名称[可能不存在]。
    /**
     * @var string
     */
    public $workspaceGroup;

    // workspace对应的zoneId列表。
    /**
     * @var string[]
     */
    public $zones;

}
