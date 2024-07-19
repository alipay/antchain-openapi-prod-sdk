<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PublishIotbasicAppreleaseorderRequest extends Model
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

    // 应用包id
    /**
     * @var string
     */
    public $apkId;

    // 发布方式
    // DEVICE：指定设备发布
    // VERSION：指定版本发布
    /**
     * @var string
     */
    public $releaseMode;

    // 指定发布方式的数据列表
    // 发布方式为DEVICE，字段为设备did列表；
    // 发布方式为VERSION，字段为应用包id列表；
    /**
     * @var string[]
     */
    public $dataList;

    // 对于数据列表中的设备存在升级中的任务是否覆盖安装？否：返回升级中的设备列表；是：取消升级中的设备升级任务，使用新的任务覆盖升级
    /**
     * @var bool
     */
    public $cover;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apkId'             => 'apk_id',
        'releaseMode'       => 'release_mode',
        'dataList'          => 'data_list',
        'cover'             => 'cover',
    ];

    public function validate()
    {
        Model::validateRequired('apkId', $this->apkId, true);
        Model::validateRequired('releaseMode', $this->releaseMode, true);
        Model::validateRequired('dataList', $this->dataList, true);
        Model::validateRequired('cover', $this->cover, true);
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
        if (null !== $this->apkId) {
            $res['apk_id'] = $this->apkId;
        }
        if (null !== $this->releaseMode) {
            $res['release_mode'] = $this->releaseMode;
        }
        if (null !== $this->dataList) {
            $res['data_list'] = $this->dataList;
        }
        if (null !== $this->cover) {
            $res['cover'] = $this->cover;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishIotbasicAppreleaseorderRequest
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
        if (isset($map['apk_id'])) {
            $model->apkId = $map['apk_id'];
        }
        if (isset($map['release_mode'])) {
            $model->releaseMode = $map['release_mode'];
        }
        if (isset($map['data_list'])) {
            if (!empty($map['data_list'])) {
                $model->dataList = $map['data_list'];
            }
        }
        if (isset($map['cover'])) {
            $model->cover = $map['cover'];
        }

        return $model;
    }
}
