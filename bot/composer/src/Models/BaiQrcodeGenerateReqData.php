<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiQrcodeGenerateReqData extends Model
{
    // 二维码的码值
    /**
     * @example TEST1234567890
     *
     * @var string
     */
    public $qrcodeContent;
    protected $_name = [
        'qrcodeContent' => 'qrcode_content',
    ];

    public function validate()
    {
        Model::validateRequired('qrcodeContent', $this->qrcodeContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->qrcodeContent) {
            $res['qrcode_content'] = $this->qrcodeContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiQrcodeGenerateReqData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['qrcode_content'])) {
            $model->qrcodeContent = $map['qrcode_content'];
        }

        return $model;
    }
}
