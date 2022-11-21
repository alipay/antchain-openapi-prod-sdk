<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class PagequeryLicenceMeterdataRequest extends Model
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

    // 产品Code，如果不传参数，默认是“SOFA”
    /**
     * @var string
     */
    public $productCode;

    // 传入商品Code，必填：mesh、mq、dtx 等
    /**
     * @var string
     */
    public $commodityCode;

    // SOFA的实例ID。
    // 如果不传则查询总量（合并所有实例的数据）
    /**
     * @var string
     */
    public $instanceId;

    // 计量开始时间，只支持整点时间
    /**
     * @var string
     */
    public $meterBegin;

    // 计量结束时间，只支持整点时间（不包含）
    /**
     * @var string
     */
    public $meterEnd;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // 每页显示条数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productCode'       => 'product_code',
        'commodityCode'     => 'commodity_code',
        'instanceId'        => 'instance_id',
        'meterBegin'        => 'meter_begin',
        'meterEnd'          => 'meter_end',
        'currentPage'       => 'current_page',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('meterBegin', $this->meterBegin, true);
        Model::validateRequired('meterEnd', $this->meterEnd, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->meterBegin) {
            $res['meter_begin'] = $this->meterBegin;
        }
        if (null !== $this->meterEnd) {
            $res['meter_end'] = $this->meterEnd;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryLicenceMeterdataRequest
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
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['meter_begin'])) {
            $model->meterBegin = $map['meter_begin'];
        }
        if (isset($map['meter_end'])) {
            $model->meterEnd = $map['meter_end'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
