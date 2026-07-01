<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CertificateInfo extends Model
{
    // 存证证明的证书内容的SHA256哈希值
    /**
     * @example 6b7966f4a30a7fec43a6b5ca8e4610f63d320f03ee698945014c0bbc13c6beba
     *
     * @var string
     */
    public $hash;

    // 存证证明的证书文件名
    /**
     * @example resource_name.pdf
     *
     * @var string
     */
    public $resourceName;

    // 存证证明的证书下载地址
    /**
     * @example https://resource_download_adderss
     *
     * @var string
     */
    public $resourceUrl;
    protected $_name = [
        'hash'         => 'hash',
        'resourceName' => 'resource_name',
        'resourceUrl'  => 'resource_url',
    ];

    public function validate()
    {
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('resourceName', $this->resourceName, true);
        Model::validateRequired('resourceUrl', $this->resourceUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->resourceUrl) {
            $res['resource_url'] = $this->resourceUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertificateInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['resource_url'])) {
            $model->resourceUrl = $map['resource_url'];
        }

        return $model;
    }
}
