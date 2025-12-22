<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CaSystemSignFileRequest extends Model
{
    // 单次请求文件唯一id，与AntSignFileRequest中的fileId对应
    /**
     * @example 签署文件id
     *
     * @var string
     */
    public $fileId;

    // 签署区域信息（包括印模信息）
    /**
     * @example
     *
     * @var CaSystemSignAreaRequest[]
     */
    public $caSystemSignAreaRequestList;
    protected $_name = [
        'fileId'                      => 'file_id',
        'caSystemSignAreaRequestList' => 'ca_system_sign_area_request_list',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('caSystemSignAreaRequestList', $this->caSystemSignAreaRequestList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->caSystemSignAreaRequestList) {
            $res['ca_system_sign_area_request_list'] = [];
            if (null !== $this->caSystemSignAreaRequestList && \is_array($this->caSystemSignAreaRequestList)) {
                $n = 0;
                foreach ($this->caSystemSignAreaRequestList as $item) {
                    $res['ca_system_sign_area_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
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
        if (isset($map['ca_system_sign_area_request_list'])) {
            if (!empty($map['ca_system_sign_area_request_list'])) {
                $model->caSystemSignAreaRequestList = [];
                $n                                  = 0;
                foreach ($map['ca_system_sign_area_request_list'] as $item) {
                    $model->caSystemSignAreaRequestList[$n++] = null !== $item ? CaSystemSignAreaRequest::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
