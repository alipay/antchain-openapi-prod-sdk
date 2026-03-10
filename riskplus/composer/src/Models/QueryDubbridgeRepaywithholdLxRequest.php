<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRepaywithholdLxRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 代扣请求流水号
    /**
     * @var string
     */
    public $withholdSerialNo;

    // 合作方代码
    /**
     * @var string
     */
    public $partnerCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'withholdSerialNo'  => 'withhold_serial_no',
        'partnerCode'       => 'partner_code',
    ];

    public function validate()
    {
        Model::validateRequired('withholdSerialNo', $this->withholdSerialNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->withholdSerialNo) {
            $res['withhold_serial_no'] = $this->withholdSerialNo;
        }
        if (null !== $this->partnerCode) {
            $res['partner_code'] = $this->partnerCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRepaywithholdLxRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['withhold_serial_no'])) {
            $model->withholdSerialNo = $map['withhold_serial_no'];
        }
        if (isset($map['partner_code'])) {
            $model->partnerCode = $map['partner_code'];
        }

        return $model;
    }
}
