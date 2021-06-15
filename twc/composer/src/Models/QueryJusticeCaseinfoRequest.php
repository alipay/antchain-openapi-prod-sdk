<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJusticeCaseinfoRequest extends Model
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

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
    /**
     * @var string
     */
    public $clientToken;

    // 案件编号
    /**
     * @var string
     */
    public $caseNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'clientToken'       => 'client_token',
        'caseNo'            => 'case_no',
    ];

    public function validate()
    {
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateRequired('caseNo', $this->caseNo, true);
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
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->caseNo) {
            $res['case_no'] = $this->caseNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJusticeCaseinfoRequest
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
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['case_no'])) {
            $model->caseNo = $map['case_no'];
        }

        return $model;
    }
}
