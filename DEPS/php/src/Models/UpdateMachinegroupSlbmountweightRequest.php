<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateMachinegroupSlbmountweightRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'fromAliyun' => 'from_aliyun',
        'machineGroupId' => 'machine_group_id',
        'slbMountInfoList' => 'slb_mount_info_list',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('machineGroupId', $this->machineGroupId, true);
        Model::validateRequired('slbMountInfoList', $this->slbMountInfoList, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->fromAliyun) {
            $res['from_aliyun'] = $this->fromAliyun;
        }
        if (null !== $this->machineGroupId) {
            $res['machine_group_id'] = $this->machineGroupId;
        }
        if (null !== $this->slbMountInfoList) {
            $res['slb_mount_info_list'] = $this->slbMountInfoList;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateMachinegroupSlbmountweightRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['from_aliyun'])){
            $model->fromAliyun = $map['from_aliyun'];
        }
        if(isset($map['machine_group_id'])){
            $model->machineGroupId = $map['machine_group_id'];
        }
        if(isset($map['slb_mount_info_list'])){
            if(!empty($map['slb_mount_info_list'])){
                $model->slbMountInfoList = $map['slb_mount_info_list'];
            }
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // from_aliyun
    /**
     * @var bool
     */
    public $fromAliyun;

    // 分组 ID
    /**
     * @var string
     */
    public $machineGroupId;

    // 挂载权重信息列表
    /**
     * @var string[]
     */
    public $slbMountInfoList;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
