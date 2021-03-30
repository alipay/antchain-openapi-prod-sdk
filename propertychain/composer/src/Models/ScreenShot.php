<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ScreenShot extends Model
{
    // id
    /**
     * @example fileId
     *
     * @var string
     */
    public $fileId;

    // url
    /**
     * @example fileUrl
     *
     * @var string
     */
    public $fileUrl;

    // 时间
    /**
     * @example screenshotTime
     *
     * @var int
     */
    public $screenshotTime;

    // 上链txHash
    /**
     * @example txHash
     *
     * @var string
     */
    public $txHash;

    // 设备名称
    /**
     * @example deviceName
     *
     * @var string
     */
    public $deviceName;

    // 关联仓位名称列表
    /**
     * @example locationNameList
     *
     * @var string[]
     */
    public $locationNameList;
    protected $_name = [
        'fileId'           => 'file_id',
        'fileUrl'          => 'file_url',
        'screenshotTime'   => 'screenshot_time',
        'txHash'           => 'tx_hash',
        'deviceName'       => 'device_name',
        'locationNameList' => 'location_name_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->screenshotTime) {
            $res['screenshot_time'] = $this->screenshotTime;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->locationNameList) {
            $res['location_name_list'] = $this->locationNameList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScreenShot
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['screenshot_time'])) {
            $model->screenshotTime = $map['screenshot_time'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['location_name_list'])) {
            if (!empty($map['location_name_list'])) {
                $model->locationNameList = $map['location_name_list'];
            }
        }

        return $model;
    }
}
