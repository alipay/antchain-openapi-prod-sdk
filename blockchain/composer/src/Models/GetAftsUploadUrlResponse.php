<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetAftsUploadUrlResponse extends Model
{
    // 11121312
    /**
     * @example 123
     *
     * @var string
     */
    public $massToken;

    // 上传文件地址
    /**
     * @example http://uploadExcamp.com
     *
     * @var string
     */
    public $uploadUrl;
    protected $_name = [
        'massToken' => 'mass_token',
        'uploadUrl' => 'upload_url',
    ];

    public function validate()
    {
        Model::validateRequired('massToken', $this->massToken, true);
        Model::validateRequired('uploadUrl', $this->uploadUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->massToken) {
            $res['mass_token'] = $this->massToken;
        }
        if (null !== $this->uploadUrl) {
            $res['upload_url'] = $this->uploadUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAftsUploadUrlResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mass_token'])) {
            $model->massToken = $map['mass_token'];
        }
        if (isset($map['upload_url'])) {
            $model->uploadUrl = $map['upload_url'];
        }

        return $model;
    }
}
