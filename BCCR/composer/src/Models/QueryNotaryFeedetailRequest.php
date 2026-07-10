<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryNotaryFeedetailRequest extends Model
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

    // 公证处ID
    /**
     * @var string
     */
    public $orgId;

    // 公证书类型
    /**
     * @var string
     */
    public $orderType;

    // 纸质公证书份数
    /**
     * @var int
     */
    public $copies;

    // 证据列表
    /**
     * @var EvidInfo[]
     */
    public $evidInfoList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orgId'             => 'org_id',
        'orderType'         => 'order_type',
        'copies'            => 'copies',
        'evidInfoList'      => 'evid_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('orgId', $this->orgId, true);
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('evidInfoList', $this->evidInfoList, true);
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
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->copies) {
            $res['copies'] = $this->copies;
        }
        if (null !== $this->evidInfoList) {
            $res['evid_info_list'] = [];
            if (null !== $this->evidInfoList && \is_array($this->evidInfoList)) {
                $n = 0;
                foreach ($this->evidInfoList as $item) {
                    $res['evid_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNotaryFeedetailRequest
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
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['copies'])) {
            $model->copies = $map['copies'];
        }
        if (isset($map['evid_info_list'])) {
            if (!empty($map['evid_info_list'])) {
                $model->evidInfoList = [];
                $n                   = 0;
                foreach ($map['evid_info_list'] as $item) {
                    $model->evidInfoList[$n++] = null !== $item ? EvidInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
