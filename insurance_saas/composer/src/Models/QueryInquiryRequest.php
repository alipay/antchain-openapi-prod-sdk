<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryInquiryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 询价id
    /**
     * @var string
     */
    public $inquiryNoInner;
    protected $_name = [
        'authToken'      => 'auth_token',
        'inquiryNoInner' => 'inquiry_no_inner',
    ];

    public function validate()
    {
        Model::validateRequired('inquiryNoInner', $this->inquiryNoInner, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->inquiryNoInner) {
            $res['inquiry_no_inner'] = $this->inquiryNoInner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInquiryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['inquiry_no_inner'])) {
            $model->inquiryNoInner = $map['inquiry_no_inner'];
        }

        return $model;
    }
}
