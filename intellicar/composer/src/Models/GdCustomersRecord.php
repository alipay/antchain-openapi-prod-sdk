<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class GdCustomersRecord extends Model
{
    // 城市编码，数据类型为店铺或者城市时返回该属性与值
    /**
     * @example 021
     *
     * @var string
     */
    public $citycode;

    // 品牌id
    /**
     * @example 104
     *
     * @var string
     */
    public $brandId;

    // 店铺id，数据类型为店铺或者店铺品牌时返回该属性与值
    /**
     * @example 26nhJ8duzh
     *
     * @var string
     */
    public $shopId;

    // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
    /**
     * @example 20230102
     *
     * @var string
     */
    public $time;

    // 重叠指数集合
    /**
     * @example
     *
     * @var Overlap[]
     */
    public $overlapList;

    // 重叠指数集合条数
    /**
     * @example 2
     *
     * @var string
     */
    public $overlapListNum;

    // 流入指数集合
    /**
     * @example
     *
     * @var GdSrc[]
     */
    public $srcList;

    // 流入指数条数
    /**
     * @example 2
     *
     * @var string
     */
    public $srcListNum;

    // 流出指数集合
    /**
     * @example
     *
     * @var GdDest[]
     */
    public $destList;

    // 流出指数条数
    /**
     * @example 2
     *
     * @var string
     */
    public $destListNum;
    protected $_name = [
        'citycode'       => 'citycode',
        'brandId'        => 'brand_id',
        'shopId'         => 'shop_id',
        'time'           => 'time',
        'overlapList'    => 'overlap_list',
        'overlapListNum' => 'overlap_list_num',
        'srcList'        => 'src_list',
        'srcListNum'     => 'src_list_num',
        'destList'       => 'dest_list',
        'destListNum'    => 'dest_list_num',
    ];

    public function validate()
    {
        Model::validateRequired('citycode', $this->citycode, true);
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('shopId', $this->shopId, true);
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('overlapList', $this->overlapList, true);
        Model::validateRequired('overlapListNum', $this->overlapListNum, true);
        Model::validateRequired('srcList', $this->srcList, true);
        Model::validateRequired('srcListNum', $this->srcListNum, true);
        Model::validateRequired('destList', $this->destList, true);
        Model::validateRequired('destListNum', $this->destListNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->citycode) {
            $res['citycode'] = $this->citycode;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->overlapList) {
            $res['overlap_list'] = [];
            if (null !== $this->overlapList && \is_array($this->overlapList)) {
                $n = 0;
                foreach ($this->overlapList as $item) {
                    $res['overlap_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->overlapListNum) {
            $res['overlap_list_num'] = $this->overlapListNum;
        }
        if (null !== $this->srcList) {
            $res['src_list'] = [];
            if (null !== $this->srcList && \is_array($this->srcList)) {
                $n = 0;
                foreach ($this->srcList as $item) {
                    $res['src_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->srcListNum) {
            $res['src_list_num'] = $this->srcListNum;
        }
        if (null !== $this->destList) {
            $res['dest_list'] = [];
            if (null !== $this->destList && \is_array($this->destList)) {
                $n = 0;
                foreach ($this->destList as $item) {
                    $res['dest_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->destListNum) {
            $res['dest_list_num'] = $this->destListNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GdCustomersRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['citycode'])) {
            $model->citycode = $map['citycode'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['overlap_list'])) {
            if (!empty($map['overlap_list'])) {
                $model->overlapList = [];
                $n                  = 0;
                foreach ($map['overlap_list'] as $item) {
                    $model->overlapList[$n++] = null !== $item ? Overlap::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['overlap_list_num'])) {
            $model->overlapListNum = $map['overlap_list_num'];
        }
        if (isset($map['src_list'])) {
            if (!empty($map['src_list'])) {
                $model->srcList = [];
                $n              = 0;
                foreach ($map['src_list'] as $item) {
                    $model->srcList[$n++] = null !== $item ? GdSrc::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['src_list_num'])) {
            $model->srcListNum = $map['src_list_num'];
        }
        if (isset($map['dest_list'])) {
            if (!empty($map['dest_list'])) {
                $model->destList = [];
                $n               = 0;
                foreach ($map['dest_list'] as $item) {
                    $model->destList[$n++] = null !== $item ? GdDest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['dest_list_num'])) {
            $model->destListNum = $map['dest_list_num'];
        }

        return $model;
    }
}
