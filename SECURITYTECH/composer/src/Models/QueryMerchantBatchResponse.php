<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\MaoQueryMerchantResult;

class QueryMerchantBatchResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'merchantResultList' => 'merchant_result_list',
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
        if (null !== $this->merchantResultList) {
            $res['merchant_result_list'] = [];
            if(null !== $this->merchantResultList && is_array($this->merchantResultList)){
                $n = 0;
                foreach($this->merchantResultList as $item){
                    $res['merchant_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMerchantBatchResponse
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
        if(isset($map['merchant_result_list'])){
            if(!empty($map['merchant_result_list'])){
                $model->merchantResultList = [];
                $n = 0;
                foreach($map['merchant_result_list'] as $item) {
                    $model->merchantResultList[$n++] = null !== $item ? MaoQueryMerchantResult::fromMap($item) : $item;
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

    // 商户入驻查询结果列表
    /**
     * @var MaoQueryMerchantResult[]
     */
    public $merchantResultList;

}
