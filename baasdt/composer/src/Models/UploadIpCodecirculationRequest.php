<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UploadIpCodecirculationRequest extends Model
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

    // 基础请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    //
    // 正版码的编码
    /**
     * @var string
     */
    public $code;

    // 正版码流转信息，每次最多10条信息。
    /**
     * @var CodeCirculation[]
     */
    public $codeCirculationList;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'baseRequest'         => 'base_request',
        'code'                => 'code',
        'codeCirculationList' => 'code_circulation_list',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('codeCirculationList', $this->codeCirculationList, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->codeCirculationList) {
            $res['code_circulation_list'] = [];
            if (null !== $this->codeCirculationList && \is_array($this->codeCirculationList)) {
                $n = 0;
                foreach ($this->codeCirculationList as $item) {
                    $res['code_circulation_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadIpCodecirculationRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['code_circulation_list'])) {
            if (!empty($map['code_circulation_list'])) {
                $model->codeCirculationList = [];
                $n                          = 0;
                foreach ($map['code_circulation_list'] as $item) {
                    $model->codeCirculationList[$n++] = null !== $item ? CodeCirculation::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
