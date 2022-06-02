<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QrCodeValue extends Model
{
    // 二维码链接
    /**
     * @example 二维码链接
     *
     * @var string
     */
    public $qrCodeUrl;

    // 二维码描述信息。例如：请使用 xxx app 扫码登录
    /**
     * @example 二维码描述信息。例如：请使用 xxx app 扫码登录
     *
     * @var string
     */
    public $desc;

    // 二维码在多长时间后失效，单位：秒
    /**
     * @example 60
     *
     * @var int
     */
    public $timeout;
    protected $_name = [
        'qrCodeUrl' => 'qr_code_url',
        'desc'      => 'desc',
        'timeout'   => 'timeout',
    ];

    public function validate()
    {
        Model::validateRequired('qrCodeUrl', $this->qrCodeUrl, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('timeout', $this->timeout, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->qrCodeUrl) {
            $res['qr_code_url'] = $this->qrCodeUrl;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QrCodeValue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['qr_code_url'])) {
            $model->qrCodeUrl = $map['qr_code_url'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }

        return $model;
    }
}
