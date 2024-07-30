<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSystemSignFileRequest extends Model
{
    // 签署文件id,和签署文件列表fileId呼应
    /**
     * @example F2435354
     *
     * @var string
     */
    public $fileId;

    // 签署文件列表（包含印模和签署区域）
    /**
     * @example
     *
     * @var CaSystemSignAreaRequest[]
     */
    public $systemSignAreaRequestList;
    protected $_name = [
        'fileId'                    => 'file_id',
        'systemSignAreaRequestList' => 'system_sign_area_request_list',
    ];

    public function validate()
    {
        Model::validateRequired('systemSignAreaRequestList', $this->systemSignAreaRequestList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->systemSignAreaRequestList) {
            $res['system_sign_area_request_list'] = [];
            if (null !== $this->systemSignAreaRequestList && \is_array($this->systemSignAreaRequestList)) {
                $n = 0;
                foreach ($this->systemSignAreaRequestList as $item) {
                    $res['system_sign_area_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSystemSignFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['system_sign_area_request_list'])) {
            if (!empty($map['system_sign_area_request_list'])) {
                $model->systemSignAreaRequestList = [];
                $n                                = 0;
                foreach ($map['system_sign_area_request_list'] as $item) {
                    $model->systemSignAreaRequestList[$n++] = null !== $item ? CaSystemSignAreaRequest::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
