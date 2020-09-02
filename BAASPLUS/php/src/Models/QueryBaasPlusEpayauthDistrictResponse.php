<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASPLUS\Models\Institution;

class QueryBaasPlusEpayauthDistrictResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'districtDetails' => 'district_details',
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
        if (null !== $this->districtDetails) {
            $res['district_details'] = [];
            if(null !== $this->districtDetails && is_array($this->districtDetails)){
                $n = 0;
                foreach($this->districtDetails as $item){
                    $res['district_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusEpayauthDistrictResponse
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
        if(isset($map['district_details'])){
            if(!empty($map['district_details'])){
                $model->districtDetails = [];
                $n = 0;
                foreach($map['district_details'] as $item) {
                    $model->districtDetails[$n++] = null !== $item ? Institution::fromMap($item) : $item;
                }
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

    // District列表
    /**
     * @var Institution[]
     */
    public $districtDetails;

}
