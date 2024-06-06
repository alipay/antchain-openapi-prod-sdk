<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class ImportAistudioOssRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 阿里云oss路径
    /**
     * @var string
     */
    public $aliyunOssPath;

    // 主站oss路径
    /**
     * @var string
     */
    public $antOssPath;
    protected $_name = [
        'authToken'     => 'auth_token',
        'aliyunOssPath' => 'aliyun_oss_path',
        'antOssPath'    => 'ant_oss_path',
    ];

    public function validate()
    {
        Model::validateRequired('aliyunOssPath', $this->aliyunOssPath, true);
        Model::validateRequired('antOssPath', $this->antOssPath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->aliyunOssPath) {
            $res['aliyun_oss_path'] = $this->aliyunOssPath;
        }
        if (null !== $this->antOssPath) {
            $res['ant_oss_path'] = $this->antOssPath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportAistudioOssRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['aliyun_oss_path'])) {
            $model->aliyunOssPath = $map['aliyun_oss_path'];
        }
        if (isset($map['ant_oss_path'])) {
            $model->antOssPath = $map['ant_oss_path'];
        }

        return $model;
    }
}
