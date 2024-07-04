<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryQmpTenantActionplaninfoRequest extends Model
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

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 页容量
    /**
     * @var int
     */
    public $pageSize;

    // 渠道code
    /**
     * @var string
     */
    public $channelType;

    // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
    /**
     * @var string
     */
    public $industryTag;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'channelType'       => 'channel_type',
        'industryTag'       => 'industry_tag',
    ];

    public function validate()
    {
        Model::validateRequired('channelType', $this->channelType, true);
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
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->channelType) {
            $res['channel_type'] = $this->channelType;
        }
        if (null !== $this->industryTag) {
            $res['industry_tag'] = $this->industryTag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQmpTenantActionplaninfoRequest
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
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['channel_type'])) {
            $model->channelType = $map['channel_type'];
        }
        if (isset($map['industry_tag'])) {
            $model->industryTag = $map['industry_tag'];
        }

        return $model;
    }
}
