<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DidServiceInfo extends Model
{
    // 服务的end point info
    /**
     * @example http://xxxxxx
     *
     * @var string
     */
    public $endPoint;

    // 扩展字段信息
    /**
     * @example {"item1":""}
     *
     * @var string
     */
    public $extensionInfo;
    protected $_name = [
        'endPoint'      => 'end_point',
        'extensionInfo' => 'extension_info',
    ];

    public function validate()
    {
        Model::validateRequired('endPoint', $this->endPoint, true);
        Model::validateRequired('extensionInfo', $this->extensionInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->endPoint) {
            $res['end_point'] = $this->endPoint;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidServiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['end_point'])) {
            $model->endPoint = $map['end_point'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }

        return $model;
    }
}
