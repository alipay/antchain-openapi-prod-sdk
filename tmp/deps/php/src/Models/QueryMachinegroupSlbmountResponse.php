<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryMachinegroupSlbmountResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'slbMountInfoList' => 'slb_mount_info_list',
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
        if (null !== $this->slbMountInfoList) {
            $res['slb_mount_info_list'] = $this->slbMountInfoList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMachinegroupSlbmountResponse
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
        if(isset($map['slb_mount_info_list'])){
            if(!empty($map['slb_mount_info_list'])){
                $model->slbMountInfoList = $map['slb_mount_info_list'];
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

    // SLB 挂载信息
    /**
     * @var string[]
     */
    public $slbMountInfoList;

}
