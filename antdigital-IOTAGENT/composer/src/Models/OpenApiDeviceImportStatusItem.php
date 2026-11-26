<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiDeviceImportStatusItem extends Model {
    protected $_name = [
        'uid' => 'uid',
        'deviceId' => 'device_id',
        'status' => 'status',
        'agentId' => 'agent_id',
        'alias' => 'alias',
    ];
    public function validate() {
        Model::validateRequired('uid', $this->uid, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('alias', $this->alias, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiDeviceImportStatusItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['uid'])){
            $model->uid = $map['uid'];
        }
        if(isset($map['device_id'])){
            $model->deviceId = $map['device_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['alias'])){
            $model->alias = $map['alias'];
        }
        return $model;
    }
    // MAC输入
    /**
     * @example undefined
     * @var string
     */
    public $uid;

    // 现有设备记录业务ID
    /**
     * @example undefined
     * @var string
     */
    public $deviceId;

    // NOT_FOUND是查询未找到记录；其他三态原样映射AiDeviceStatusEnum；枚举:NOT_FOUND,REGISTERING,REGISTERED,REGISTER_FAILED
    /**
     * @example undefined
     * @var string
     */
    public $status;

    // 设备绑定的智能体ID；可用于对话等后续操作；NOT_FOUND时为null
    /**
     * @example undefined
     * @var string
     */
    public $agentId;

    // 设备别名（若已设置）；NOT_FOUND时为null
    /**
     * @example undefined
     * @var string
     */
    public $alias;

}
