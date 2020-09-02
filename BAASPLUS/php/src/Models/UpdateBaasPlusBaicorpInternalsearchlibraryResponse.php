<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateBaasPlusBaicorpInternalsearchlibraryResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'customId' => 'custom_id',
        'updateDesc' => 'update_desc',
        'updateResult' => 'update_result',
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
        if (null !== $this->customId) {
            $res['custom_id'] = $this->customId;
        }
        if (null !== $this->updateDesc) {
            $res['update_desc'] = $this->updateDesc;
        }
        if (null !== $this->updateResult) {
            $res['update_result'] = $this->updateResult;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBaasPlusBaicorpInternalsearchlibraryResponse
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
        if(isset($map['custom_id'])){
            $model->customId = $map['custom_id'];
        }
        if(isset($map['update_desc'])){
            $model->updateDesc = $map['update_desc'];
        }
        if(isset($map['update_result'])){
            $model->updateResult = $map['update_result'];
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

    // NounceId
    /**
     * @var string
     */
    public $customId;

    // 更新描述、更新失败原因
    /**
     * @var string
     */
    public $updateDesc;

    // 更新是否成功
    /**
     * @var string
     */
    public $updateResult;

}
