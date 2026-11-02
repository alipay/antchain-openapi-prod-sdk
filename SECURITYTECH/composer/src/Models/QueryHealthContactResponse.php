<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\HealthContactInfo;

class QueryHealthContactResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'channeId' => 'channe_id',
        'tuid' => 'tuid',
        'contactList' => 'contact_list',
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
        if (null !== $this->channeId) {
            $res['channe_id'] = $this->channeId;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->contactList) {
            $res['contact_list'] = [];
            if(null !== $this->contactList && is_array($this->contactList)){
                $n = 0;
                foreach($this->contactList as $item){
                    $res['contact_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryHealthContactResponse
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
        if(isset($map['channe_id'])){
            $model->channeId = $map['channe_id'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['contact_list'])){
            if(!empty($map['contact_list'])){
                $model->contactList = [];
                $n = 0;
                foreach($map['contact_list'] as $item) {
                    $model->contactList[$n++] = null !== $item ? HealthContactInfo::fromMap($item) : $item;
                }
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

    // 品牌方渠道标识
    /**
     * @var string
     */
    public $channeId;

    // 设备唯一id
    /**
     * @var string
     */
    public $tuid;

    // 健康联系人信息
    /**
     * @var HealthContactInfo[]
     */
    public $contactList;

}
