<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class UploaderInfo extends Model
{
    // 上传者证书hash
    /**
     * @example 1654570807000
     *
     * @var string
     */
    public $certHash;

    // 上传者身份证明
    /**
     * @example 123
     *
     * @var string
     */
    public $uploader;

    // 上传时间
    /**
     * @example 1654570807000
     *
     * @var int
     */
    public $uploadTime;

    // 经度
    /**
     * @example 123
     *
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @example 123
     *
     * @var string
     */
    public $latitude;
    protected $_name = [
        'certHash'   => 'cert_hash',
        'uploader'   => 'uploader',
        'uploadTime' => 'upload_time',
        'longitude'  => 'longitude',
        'latitude'   => 'latitude',
    ];

    public function validate()
    {
        Model::validateRequired('certHash', $this->certHash, true);
        Model::validateRequired('uploader', $this->uploader, true);
        Model::validateRequired('uploadTime', $this->uploadTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certHash) {
            $res['cert_hash'] = $this->certHash;
        }
        if (null !== $this->uploader) {
            $res['uploader'] = $this->uploader;
        }
        if (null !== $this->uploadTime) {
            $res['upload_time'] = $this->uploadTime;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploaderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_hash'])) {
            $model->certHash = $map['cert_hash'];
        }
        if (isset($map['uploader'])) {
            $model->uploader = $map['uploader'];
        }
        if (isset($map['upload_time'])) {
            $model->uploadTime = $map['upload_time'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }

        return $model;
    }
}
