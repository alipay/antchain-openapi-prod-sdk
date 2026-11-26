<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class ImportBlockchainBotIotsuccessProductDeviceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'successUidList' => 'success_uid_list',
        'existedUidList' => 'existed_uid_list',
        'invalidUidList' => 'invalid_uid_list',
    ];
    public function validate() {
        Model::validateRequired('successUidList', $this->successUidList, true);
        Model::validateRequired('existedUidList', $this->existedUidList, true);
        Model::validateRequired('invalidUidList', $this->invalidUidList, true);
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
        if (null !== $this->successUidList) {
            $res['success_uid_list'] = $this->successUidList;
        }
        if (null !== $this->existedUidList) {
            $res['existed_uid_list'] = $this->existedUidList;
        }
        if (null !== $this->invalidUidList) {
            $res['invalid_uid_list'] = $this->invalidUidList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportBlockchainBotIotsuccessProductDeviceResponse
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
        if(isset($map['success_uid_list'])){
            if(!empty($map['success_uid_list'])){
                $model->successUidList = $map['success_uid_list'];
            }
        }
        if(isset($map['existed_uid_list'])){
            if(!empty($map['existed_uid_list'])){
                $model->existedUidList = $map['existed_uid_list'];
            }
        }
        if(isset($map['invalid_uid_list'])){
            if(!empty($map['invalid_uid_list'])){
                $model->invalidUidList = $map['invalid_uid_list'];
            }
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 已有导入链已提交的MAC，不等于注册完成或已激活
    /**
     * @var string[]
     */
    public $successUidList;

    // 已有设备记录的MAC，可能仍在REGISTERING；沿旧名单语义
    /**
     * @var string[]
     */
    public $existedUidList;

    // 已有MAC校验判定无效的输入
    /**
     * @var string[]
     */
    public $invalidUidList;

}
