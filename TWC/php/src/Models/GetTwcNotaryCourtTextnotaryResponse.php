<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\TsrResponse;

class GetTwcNotaryCourtTextnotaryResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'agencyCode' => 'agency_code',
        'applicationCode' => 'application_code',
        'businessType' => 'business_type',
        'dataType' => 'data_type',
        'textContent' => 'text_content',
        'tsr' => 'tsr',
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
        if (null !== $this->agencyCode) {
            $res['agency_code'] = $this->agencyCode;
        }
        if (null !== $this->applicationCode) {
            $res['application_code'] = $this->applicationCode;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->textContent) {
            $res['text_content'] = $this->textContent;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = null !== $this->tsr ? $this->tsr->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetTwcNotaryCourtTextnotaryResponse
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
        if(isset($map['agency_code'])){
            $model->agencyCode = $map['agency_code'];
        }
        if(isset($map['application_code'])){
            $model->applicationCode = $map['application_code'];
        }
        if(isset($map['business_type'])){
            $model->businessType = $map['business_type'];
        }
        if(isset($map['data_type'])){
            $model->dataType = $map['data_type'];
        }
        if(isset($map['text_content'])){
            $model->textContent = $map['text_content'];
        }
        if(isset($map['tsr'])){
            $model->tsr = TsrResponse::fromMap($map['tsr']);
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

    // 对应的法院编号
    /**
     * @var string
     */
    public $agencyCode;

    // 对应的法院应用ID
    /**
     * @var string
     */
    public $applicationCode;

    // 业务类型标识
    /**
     * @var string
     */
    public $businessType;

    // 数据类型标识
    /**
     * @var string
     */
    public $dataType;

    // 文本数据
    /**
     * @var string
     */
    public $textContent;

    // 可信时间戳
    /**
     * @var TsrResponse
     */
    public $tsr;

}
