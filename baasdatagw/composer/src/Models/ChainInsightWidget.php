<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightWidget extends Model
{
    // 看版类型，内置看版类型为Default
    /**
     * @example Default
     *
     * @var string
     */
    public $widgetType;

    // 看版子类型；ChainIdWidget, ChainAccountWidget, ChainContractWidget, ChainTotalTransactionWidget, ChainActiveAddressWidget, ChainTxTimeLineWidget
    /**
     * @example ChainIdWidget
     *
     * @var string
     */
    public $type;

    // 看版时间范围，单位小时
    /**
     * @example 24
     *
     * @var int
     */
    public $timeRange;

    // 看板ID
    /**
     * @example 001
     *
     * @var string
     */
    public $id;

    // 看版名称，最大32字符
    /**
     * @example 看板一
     *
     * @var string
     */
    public $name;

    // 看版描述，最大 255 字符
    /**
     * @example 这是一个看板
     *
     * @var string
     */
    public $description;

    // 看版创建时间，单位毫秒时间戳
    /**
     * @example 10000
     *
     * @var int
     */
    public $createTime;

    // 看版修改时间，单位毫秒时间戳
    /**
     * @example 100000
     *
     * @var int
     */
    public $modifyTime;

    // 看版对应的链ID，空表示联盟下所有的链
    /**
     * @example c3179e0d54a340a38d338664fe71d54c
     *
     * @var string
     */
    public $bizId;

    // 链名称
    /**
     * @example 测试链
     *
     * @var string
     */
    public $bizIdName;

    // 看版对应的链上账户地址，hex编码
    /**
     * @example f215a77d9326191bddf0515359976990430d4f21aa40e4ba914c2551e20fdca9
     *
     * @var string
     */
    public $hexAddress;

    // 时间轴搜索的请求
    /**
     * @example a80f3bf6b8c43ab34f4e05bbc4e00ca4617b91d420f96d09d9bb7fd01a5ad488
     *
     * @var string
     */
    public $query;
    protected $_name = [
        'widgetType'  => 'widget_type',
        'type'        => 'type',
        'timeRange'   => 'time_range',
        'id'          => 'id',
        'name'        => 'name',
        'description' => 'description',
        'createTime'  => 'create_time',
        'modifyTime'  => 'modify_time',
        'bizId'       => 'biz_id',
        'bizIdName'   => 'biz_id_name',
        'hexAddress'  => 'hex_address',
        'query'       => 'query',
    ];

    public function validate()
    {
        Model::validateRequired('widgetType', $this->widgetType, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('timeRange', $this->timeRange, true);
        Model::validateMaxLength('name', $this->name, 32);
        Model::validateMaxLength('description', $this->description, 255);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->widgetType) {
            $res['widget_type'] = $this->widgetType;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->timeRange) {
            $res['time_range'] = $this->timeRange;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizIdName) {
            $res['biz_id_name'] = $this->bizIdName;
        }
        if (null !== $this->hexAddress) {
            $res['hex_address'] = $this->hexAddress;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightWidget
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['widget_type'])) {
            $model->widgetType = $map['widget_type'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['time_range'])) {
            $model->timeRange = $map['time_range'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_id_name'])) {
            $model->bizIdName = $map['biz_id_name'];
        }
        if (isset($map['hex_address'])) {
            $model->hexAddress = $map['hex_address'];
        }
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }

        return $model;
    }
}
