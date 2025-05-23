<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class Data extends Model
{
    // 订单安排日期
    /**
     * @example 20250522
     *
     * @var string
     */
    public $day;

    // 设备信息（oaid）
    /**
     * @example ABCASFDWOIFOH
     *
     * @var string
     */
    public $device;

    // 关键词
    /**
     * @example afasf
     *
     * @var string
     */
    public $keyword;

    // 应用商店id
    // 2:OPPO
    // 3:联想
    // 4:华为
    // 5:小米
    // 6:魅族
    // 7:360
    // 8:应用宝
    // 9:VIVO
    /**
     * @example 2
     *
     * @var string
     */
    public $storeId;

    // 应用商店描述
    /**
     * @example 测试的
     *
     * @var string
     */
    public $storeDesc;

    // 激活时间
    /**
     * @example 20250522
     *
     * @var string
     */
    public $activeTime;

    // 任务截图1
    /**
     * @example abc.com
     *
     * @var string
     */
    public $imgUrl1;

    // 任务截图2
    /**
     * @example abc.com
     *
     * @var string
     */
    public $imgUrl2;
    protected $_name = [
        'day'        => 'day',
        'device'     => 'device',
        'keyword'    => 'keyword',
        'storeId'    => 'store_id',
        'storeDesc'  => 'store_desc',
        'activeTime' => 'active_time',
        'imgUrl1'    => 'img_url_1',
        'imgUrl2'    => 'img_url_2',
    ];

    public function validate()
    {
        Model::validateRequired('day', $this->day, true);
        Model::validateRequired('device', $this->device, true);
        Model::validateRequired('keyword', $this->keyword, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('storeDesc', $this->storeDesc, true);
        Model::validateRequired('activeTime', $this->activeTime, true);
        Model::validateRequired('imgUrl1', $this->imgUrl1, true);
        Model::validateRequired('imgUrl2', $this->imgUrl2, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->day) {
            $res['day'] = $this->day;
        }
        if (null !== $this->device) {
            $res['device'] = $this->device;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->storeDesc) {
            $res['store_desc'] = $this->storeDesc;
        }
        if (null !== $this->activeTime) {
            $res['active_time'] = $this->activeTime;
        }
        if (null !== $this->imgUrl1) {
            $res['img_url_1'] = $this->imgUrl1;
        }
        if (null !== $this->imgUrl2) {
            $res['img_url_2'] = $this->imgUrl2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Data
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['day'])) {
            $model->day = $map['day'];
        }
        if (isset($map['device'])) {
            $model->device = $map['device'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['store_desc'])) {
            $model->storeDesc = $map['store_desc'];
        }
        if (isset($map['active_time'])) {
            $model->activeTime = $map['active_time'];
        }
        if (isset($map['img_url_1'])) {
            $model->imgUrl1 = $map['img_url_1'];
        }
        if (isset($map['img_url_2'])) {
            $model->imgUrl2 = $map['img_url_2'];
        }

        return $model;
    }
}
