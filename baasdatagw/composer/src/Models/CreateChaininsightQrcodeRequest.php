<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class CreateChaininsightQrcodeRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizId;

    // QR码类型，枚举值：CONTRACT / HEXADDRESS / TX / CHAIN / BLOCK / TIMELINE
    /**
     * @var string
     */
    public $pageType;

    // 页面对应的参数
    /**
     * @var MapEntry[]
     */
    public $paramMap;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'pageType'          => 'page_type',
        'paramMap'          => 'param_map',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('pageType', $this->pageType, true);
        Model::validateRequired('paramMap', $this->paramMap, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->pageType) {
            $res['page_type'] = $this->pageType;
        }
        if (null !== $this->paramMap) {
            $res['param_map'] = [];
            if (null !== $this->paramMap && \is_array($this->paramMap)) {
                $n = 0;
                foreach ($this->paramMap as $item) {
                    $res['param_map'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateChaininsightQrcodeRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['page_type'])) {
            $model->pageType = $map['page_type'];
        }
        if (isset($map['param_map'])) {
            if (!empty($map['param_map'])) {
                $model->paramMap = [];
                $n               = 0;
                foreach ($map['param_map'] as $item) {
                    $model->paramMap[$n++] = null !== $item ? MapEntry::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
