<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarVersionInstance;

class ListSidecarInstanceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'sidecarVersionInstances' => 'sidecar_version_instances',
        'totalCount' => 'total_count',
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
        if (null !== $this->sidecarVersionInstances) {
            $res['sidecar_version_instances'] = [];
            if(null !== $this->sidecarVersionInstances && is_array($this->sidecarVersionInstances)){
                $n = 0;
                foreach($this->sidecarVersionInstances as $item){
                    $res['sidecar_version_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListSidecarInstanceResponse
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
        if(isset($map['sidecar_version_instances'])){
            if(!empty($map['sidecar_version_instances'])){
                $model->sidecarVersionInstances = [];
                $n = 0;
                foreach($map['sidecar_version_instances'] as $item) {
                    $model->sidecarVersionInstances[$n++] = null !== $item ? SidecarVersionInstance::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
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

    // sidecar版本实例列表
    /**
     * @var SidecarVersionInstance[]
     */
    public $sidecarVersionInstances;

    // 总记录条数
    /**
     * @var int
     */
    public $totalCount;

}
