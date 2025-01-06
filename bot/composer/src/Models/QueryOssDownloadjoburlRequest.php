<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryOssDownloadjoburlRequest extends Model
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

    // 获取文件类型：DEVICE_INFO（设备信息）、DEVICE_DATA（状态数据）
    /**
     * @var string
     */
    public $type;

    // 文件所属日期，yyyymmdd
    /**
     * @var string
     */
    public $date;

    // 请求状态数据是，若导出周期为小时级，则必填；文件所属小时
    /**
     * @var string
     */
    public $hour;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'type'              => 'type',
        'date'              => 'date',
        'hour'              => 'hour',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('date', $this->date, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->hour) {
            $res['hour'] = $this->hour;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOssDownloadjoburlRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['hour'])) {
            $model->hour = $map['hour'];
        }

        return $model;
    }
}
